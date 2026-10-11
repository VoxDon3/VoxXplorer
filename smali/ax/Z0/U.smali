.class public final synthetic Lax/Z0/U;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/S0/t$a;


# instance fields
.field public final synthetic a:Lax/Z0/c$a;


# direct methods
.method public synthetic constructor <init>(Lax/Z0/c$a;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/Z0/U;->a:Lax/Z0/c$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/Z0/U;->a:Lax/Z0/c$a;

    check-cast p1, Lax/Z0/c;

    invoke-static {v0, p1}, Lax/Z0/u0;->s1(Lax/Z0/c$a;Lax/Z0/c;)V

    return-void
.end method
