.class public final synthetic Lax/Z0/Q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/S0/t$a;


# instance fields
.field public final synthetic a:Lax/Z0/c$a;

.field public final synthetic b:I

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lax/Z0/c$a;II)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/Z0/Q;->a:Lax/Z0/c$a;

    iput p2, p0, Lax/Z0/Q;->b:I

    iput p3, p0, Lax/Z0/Q;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/Z0/Q;->a:Lax/Z0/c$a;

    iget v1, p0, Lax/Z0/Q;->b:I

    iget v2, p0, Lax/Z0/Q;->c:I

    check-cast p1, Lax/Z0/c;

    invoke-static {v0, v1, v2, p1}, Lax/Z0/u0;->h1(Lax/Z0/c$a;IILax/Z0/c;)V

    return-void
.end method
