.class public final synthetic Lax/i1/G;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/S0/l;


# instance fields
.field public final synthetic a:Lax/i1/N$a;

.field public final synthetic b:Lax/i1/y;

.field public final synthetic c:Lax/i1/B;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Lax/i1/N$a;Lax/i1/y;Lax/i1/B;I)V
    .registers 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/i1/G;->a:Lax/i1/N$a;

    iput-object p2, p0, Lax/i1/G;->b:Lax/i1/y;

    iput-object p3, p0, Lax/i1/G;->c:Lax/i1/B;

    iput p4, p0, Lax/i1/G;->d:I

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/i1/G;->a:Lax/i1/N$a;

    iget-object v1, p0, Lax/i1/G;->b:Lax/i1/y;

    iget-object v2, p0, Lax/i1/G;->c:Lax/i1/B;

    iget v3, p0, Lax/i1/G;->d:I

    check-cast p1, Lax/i1/N;

    invoke-static {v0, v1, v2, v3, p1}, Lax/i1/N$a;->c(Lax/i1/N$a;Lax/i1/y;Lax/i1/B;ILax/i1/N;)V

    return-void
.end method
