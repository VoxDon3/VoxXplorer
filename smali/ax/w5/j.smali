.class public final synthetic Lax/w5/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/y5/b$a;


# instance fields
.field public final synthetic a:Lax/w5/r;

.field public final synthetic b:Lax/p5/p;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lax/w5/r;Lax/p5/p;I)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/w5/j;->a:Lax/w5/r;

    iput-object p2, p0, Lax/w5/j;->b:Lax/p5/p;

    iput p3, p0, Lax/w5/j;->c:I

    return-void
.end method


# virtual methods
.method public final execute()Ljava/lang/Object;
    .registers 4

    .line 1
    iget-object v0, p0, Lax/w5/j;->a:Lax/w5/r;

    iget-object v1, p0, Lax/w5/j;->b:Lax/p5/p;

    iget v2, p0, Lax/w5/j;->c:I

    invoke-static {v0, v1, v2}, Lax/w5/r;->f(Lax/w5/r;Lax/p5/p;I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
